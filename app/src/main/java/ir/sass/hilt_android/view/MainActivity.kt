package ir.sass.hilt_android.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import ir.sass.hilt_android.R
import ir.sass.hilt_android.api.ErrorType
import ir.sass.hilt_android.api.RemoteErrorEmitter

@AndroidEntryPoint
class MainActivity : AppCompatActivity() , RemoteErrorEmitter {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(
            R.id.frameLayout,
            MainFragment()
        ).commit()
    }

    override fun onError(msg: String) {
    }

    override fun onError(errorType: ErrorType) {
    }
}

