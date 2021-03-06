package com.missclick.blackjackmini.ui.AfterFirst

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.missclick.blackjackmini.R
import com.missclick.blackjackmini.databinding.FragmentAfterFirstBinding
import com.missclick.blackjackmini.databinding.FragmentStartBinding
import com.missclick.blackjackmini.ui.processSecond.ProcessSecondFragment
import com.missclick.blackjackmini.ui.start.StartViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AfterFirst.newInstance] factory method to
 * create an instance of this fragment.
 */
class AfterFirstFragment : Fragment(R.layout.fragment_after_first) {
    private val viewModel : AfterFirstViewModel by viewModel()
    private val binding by viewBinding(FragmentAfterFirstBinding::bind)
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

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_after_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val comp = (1..5).random()
        binding.textEnemyScore.text = comp.toString()
        binding.textYouScore.text = (comp + param1!!).toString()
        if (comp + param1!! >= 7){
            if(comp + param1!! != 7){
                binding.textResult.text = "???? ??????????????????!"
            }
            else{
                binding.textResult.text = "???? ????????????????!"
            }
            Log.e("Stack",comp.toString())
            binding.button.text = "?????? ??????"
            binding.button.setOnClickListener {
                findNavController().navigate(R.id.action_afterFirstFragment_to_processFragment)
            }
        }
        else{
            binding.textResult.text = "???????????? ???????????????? ????????????????????!"
            binding.button.setOnClickListener {
                findNavController().navigate(R.id.action_afterFirstFragment_to_processSecondFragment, ProcessSecondFragment.newInstance(comp + param1!!,"not"))
            }
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AfterFirst.
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