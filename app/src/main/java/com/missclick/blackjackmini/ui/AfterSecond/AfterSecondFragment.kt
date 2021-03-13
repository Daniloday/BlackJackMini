package com.missclick.blackjackmini.ui.AfterSecond

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.missclick.blackjackmini.R
import com.missclick.blackjackmini.databinding.FragmentAfterSecondBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AfterSecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AfterSecondFragment : Fragment(R.layout.fragment_after_second) {
    private val binding by viewBinding(FragmentAfterSecondBinding::bind)
    private var param1: Int? = null
    private var param2: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getInt(ARG_PARAM1)
            param2 = it.getInt(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_after_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val you = param2!!
        val comp = param1!! + (1..5).random()
        binding.textEnemyScore.text = comp.toString()
        binding.textYouScore.text = you.toString()
        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_afterSecondFragment_to_processFragment)
        }
        if (comp in you..7)
            binding.textResult.text = "Вы проиграли!"
        else
            binding.textResult.text = "Вы выиграли!"

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AfterSecondFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: Int, param2: Int) =
                Bundle().apply {
                        putInt(ARG_PARAM1, param1)
                        putInt(ARG_PARAM2, param2)
                    }

    }
}