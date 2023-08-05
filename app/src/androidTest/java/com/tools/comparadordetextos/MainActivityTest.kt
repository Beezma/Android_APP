package com.tools.comparadordetextos

import android.widget.EditText
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.core.app.ActivityScenario.launch
import org.junit.Assert.*
import androidx.test.runner.AndroidJUnit4;
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import kotlinx.coroutines.Dispatchers
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith



@RunWith(AndroidJUnit4::class)

class MainActivityTest {

    private lateinit var viewModel: MainViewModel

    @get: Rule
    var rule: ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)


    @Before
    fun setup() {
        viewModel = MainViewModel()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun mainViewModel_CheckInitialValue() {
        Espresso.onView(
            withId(R.id.button1)
        ).perform(ViewActions.click()
        )
    }
}