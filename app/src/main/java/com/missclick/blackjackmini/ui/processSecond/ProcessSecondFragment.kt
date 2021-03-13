package com.missclick.blackjackmini.ui.processSecond

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.missclick.blackjackmini.R
import com.missclick.blackjackmini.databinding.FragmentProcessSecondBinding
import com.missclick.blackjackmini.databinding.FragmentStartBinding
import com.missclick.blackjackmini.ui.AfterFirst.AfterFirstFragment
import com.missclick.blackjackmini.ui.AfterSecond.AfterSecondFragment
import com.missclick.blackjackmini.ui.start.StartViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ProcessSecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProcessSecondFragment : Fragment() {

    private val viewModel : ProcessSecondViewModel by viewModel()
    private val binding by viewBinding(FragmentProcessSecondBinding::bind)
    // TODO: Rename and change types of parameters
    private var param1: Int? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getInt(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_process_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textView4.setOnClickListener {
            viewModel.go()
        }
        binding.materialButton.setOnClickListener {
            findNavController().navigate(R.id.action_processSecondFragment_to_afterSecondFragment, AfterSecondFragment.newInstance(1, param1!!))
        }
        binding.materialButton2.setOnClickListener {
            findNavController().navigate(R.id.action_processSecondFragment_to_afterSecondFragment, AfterSecondFragment.newInstance(2, param1!!))
        }
        binding.materialButton3.setOnClickListener {
            findNavController().navigate(R.id.action_processSecondFragment_to_afterSecondFragment, AfterSecondFragment.newInstance(3, param1!!))
        }
        binding.materialButton4.setOnClickListener {
            findNavController().navigate(R.id.action_processSecondFragment_to_afterSecondFragment, AfterSecondFragment.newInstance(4, param1!!))
        }
        binding.materialButton5.setOnClickListener {
            findNavController().navigate(R.id.action_processSecondFragment_to_afterSecondFragment, AfterSecondFragment.newInstance(5, param1!!))
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ProcessSecondFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: Int, param2: String) =
                Bundle().apply {
                    putInt(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }

    }
}