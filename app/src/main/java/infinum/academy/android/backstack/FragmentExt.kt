package infinum.academy.android.backstack

import android.util.Log
import androidx.fragment.app.Fragment

fun Fragment.printBackStack() {
    Log.d("BACKSTACKLOG", "=======BACK STACK=======")
    val backStackCount = activity?.supportFragmentManager?.backStackEntryCount ?: 0

    repeat(backStackCount) {
        Log.d(
            "BACKSTACKLOG",
            "Back Stack: ${
                activity?.supportFragmentManager?.getBackStackEntryAt(
                    (backStackCount - it) - 1
                )?.name ?: "Some Fragment"
            }"
        )
    }
    Log.d("BACKSTACKLOG", "========================")
}