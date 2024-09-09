package com.example.democollection.view.animations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.democollection.R
import com.example.democollection.databinding.FragmentViewPropertyAnimatorBinding

class ViewPropertyAnimatorFragment : Fragment() {
    private lateinit var vb: FragmentViewPropertyAnimatorBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        vb = FragmentViewPropertyAnimatorBinding.inflate(inflater, container, false)
        return vb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}