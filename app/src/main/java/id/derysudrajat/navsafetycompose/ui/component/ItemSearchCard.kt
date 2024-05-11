package id.derysudrajat.navsafetycompose.ui.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.derysudrajat.navsafetycompose.ui.theme.NavTypeSafetyTheme

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun ItemSearchCard(onClick: (query: String, listFilter: List<String>) -> Unit) {
    var isShowDetail by rememberSaveable { mutableStateOf(false) }
    var query by rememberSaveable { mutableStateOf("") }
    Card(
        modifier = Modifier.fillMaxWidth(),
        onClick = { isShowDetail = !isShowDetail }
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(text = "Search your favorite Food")
            AnimatedVisibility(visible = isShowDetail) {
                Column {
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = query, onValueChange = { query = it}
                    )
                    var selected by remember { mutableStateOf(emptyList<Int>()) }
                    val listFilter by remember {
                        mutableStateOf(listOf("Appetizers", "Main courses", "Desserts"))
                    }
                    FlowRow(
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        listFilter.forEachIndexed { index,  filter ->
                            FilterChip(
                                onClick = {
                                    val list = selected.toMutableList()
                                    if (list.contains(index)) list.remove(index) else list.add(index)
                                    selected = list
                                },
                                label = {
                                    Text(filter)
                                },
                                selected = selected.contains(index),
                                leadingIcon = if (selected.contains(index)) {
                                    {
                                        Icon(
                                            imageVector = Icons.Filled.Done,
                                            contentDescription = "Done icon",
                                            modifier = Modifier.size(FilterChipDefaults.IconSize)
                                        )
                                    }
                                } else {
                                    null
                                },
                            )
                        }
                    }
                    Button(
                        modifier = Modifier.align(Alignment.End),
                        onClick = { onClick.invoke(query, listFilter.filterIndexed { index, _ -> selected.contains(index) }) },
                        enabled = query.isNotBlank() && selected.isNotEmpty()
                    ) {
                        Text(text = "Search")
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun PreviewItemSearchCard() {
    NavTypeSafetyTheme {
        ItemSearchCard { query, listFilter ->
        }
    }
}