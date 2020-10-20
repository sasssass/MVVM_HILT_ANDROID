package ir.sass.hilt_android.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import dagger.hilt.android.AndroidEntryPoint
import ir.sass.hilt_android.R
import ir.sass.hilt_android.viewModel.MyViewModel
import kotlinx.android.synthetic.main.fragment_main.*


@AndroidEntryPoint
class MainFragment : Fragment() {
    private val viewModel: MyViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getPhoto(1).observe(viewLifecycleOwner, Observer {
            it?.let {
                imageWeb.loadUrl(it.thumbnailUrl)
            }
        })

    }
}

