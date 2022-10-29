package com.yonasoft.yonagi.presentation.screens.search.tabs

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.Tab
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.pagerTabIndicatorOffset
import com.yonasoft.yonagi.presentation.screens.search.tabs.kanji.KanjiTab
import com.yonasoft.yonagi.presentation.screens.search.tabs.word.WordTab
import com.yonasoft.yonagi.ui.theme.Red2
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@ExperimentalPagerApi
@Composable
fun SearchScreenContent(modifier: Modifier = Modifier, tabs:List<String>, pagerState:PagerState, scope: CoroutineScope) {

    Column(
        modifier = modifier.fillMaxSize()
    ) {
        SearchScreenTabLayout(pagerState, tabs, scope)
        SearchScreenHorizontalPager(tabs, pagerState)
    }
}



@ExperimentalPagerApi
@Composable
private fun SearchScreenTabLayout(
    pagerState: PagerState,
    tabs: List<String>,
    scope: CoroutineScope
) {
    ScrollableTabRow(
        selectedTabIndex = pagerState.currentPage,
        backgroundColor = Red2,
        contentColor = Color.White,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                Modifier.pagerTabIndicatorOffset(pagerState, tabPositions),
            )
        },
    ) {
        tabs.forEachIndexed { index, _ ->
            Tab(
                text = { Text(tabs[index]) },
                selected = pagerState.currentPage == index,
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                },
            )
        }
    }
}
@ExperimentalPagerApi
@Composable
private fun SearchScreenHorizontalPager(
    tabs: List<String>,
    pagerState: PagerState
) {
    HorizontalPager(
        modifier = Modifier.fillMaxSize(),
        count = tabs.size,
        state = pagerState,
    ) { page ->
        when (page) {
            0 -> WordTab()
            1 -> KanjiTab()
        }
    }
}
