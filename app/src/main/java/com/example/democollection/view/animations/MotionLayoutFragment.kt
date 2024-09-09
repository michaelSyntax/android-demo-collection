package com.example.democollection.view.animations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.democollection.R
import com.example.democollection.databinding.FragmentAnimatedVectorGraphicsBinding
import com.example.democollection.databinding.FragmentMotionLayoutBinding


class MotionLayoutFragment : Fragment() {
    private lateinit var vb: FragmentMotionLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        vb = FragmentMotionLayoutBinding.inflate(inflater, container, false)
        return vb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}