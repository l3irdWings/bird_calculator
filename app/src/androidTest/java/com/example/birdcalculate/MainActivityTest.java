package com.example.birdcalculate;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void nullValue() {
        onView(withId(R.id.operand_one_edit_text))
                .perform(typeText(""));

        onView(withId(R.id.operand_two_edit_text))
                .perform(typeText(""));

        onView(withId(R.id.operation_add_button))
                .perform(click());

        onView(withId(R.id.operation_result_text_view))
                .check(matches(withText("")));

        onView(withId(R.id.operation_sub_button))
                .perform(click());

        onView(withId(R.id.operation_result_text_view))
                .check(matches(withText("")));

        onView(withId(R.id.operation_div_button))
                .perform(click());

        onView(withId(R.id.operation_result_text_view))
                .check(matches(withText("")));

        onView(withId(R.id.operation_mul_button))
                .perform(click());

        onView(withId(R.id.operation_result_text_view))
                .check(matches(withText("")));
    }

    @Test
    public void plus() {
        onView(withId(R.id.operand_one_edit_text))
                .perform(typeText("2"));

        onView(withId(R.id.operand_two_edit_text))
                .perform(typeText("1"));

        onView(withId(R.id.operation_add_button))
                .perform(click());

        onView(withId(R.id.operation_result_text_view))
                .check(matches(withText("3.0")));
    }

    @Test
    public void minus() {
        onView(withId(R.id.operand_one_edit_text))
                .perform(typeText("2"));

        onView(withId(R.id.operand_two_edit_text))
                .perform(typeText("1"));

        onView(withId(R.id.operation_sub_button))
                .perform(click());

        onView(withId(R.id.operation_result_text_view))
                .check(matches(withText("1.0")));
    }

    @Test
    public void divide() {
        onView(withId(R.id.operand_one_edit_text))
                .perform(typeText("2"));

        onView(withId(R.id.operand_two_edit_text))
                .perform(typeText("1"));

        onView(withId(R.id.operation_div_button))
                .perform(click());

        onView(withId(R.id.operation_result_text_view))
                .check(matches(withText("2.0")));
    }

    @Test
    public void divideByZero() {
        onView(withId(R.id.operand_one_edit_text))
                .perform(typeText("3"));

        onView(withId(R.id.operand_two_edit_text))
                .perform(typeText("0"));

        onView(withId(R.id.operation_div_button))
                .perform(click());

        onView(withId(R.id.operation_result_text_view))
                .check(matches(withText("Divide second operand is not equal 0.")));
    }

    @Test
    public void multiple() {
        onView(withId(R.id.operand_one_edit_text))
                .perform(typeText("2"));

        onView(withId(R.id.operand_two_edit_text))
                .perform(typeText("1"));

        onView(withId(R.id.operation_mul_button))
                .perform(click());

        onView(withId(R.id.operation_result_text_view))
                .check(matches(withText("2.0")));
    }

}