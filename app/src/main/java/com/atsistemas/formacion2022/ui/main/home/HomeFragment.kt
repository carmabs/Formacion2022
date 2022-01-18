package com.atsistemas.formacion2022.ui.main.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.atsistemas.formacion2022.common.BaseFragment
import com.atsistemas.formacion2022.databinding.FragmentHomeBinding

/**
 * Created by Carlos Mateo Benito on 18/1/22.
 *
 * <p>
 * Copyright (c) 2022 by Carmabs. All rights reserved.
 * </p>
 *
 * @author <a href=“mailto:apps.carmabs@gmail.com”>Carlos Mateo Benito</a>
 */
class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override fun provideBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentHomeBinding {
        return FragmentHomeBinding.inflate(inflater,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            rvHome.layoutManager =LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
            rvHome.adapter = HomeAdapter(emptyList())
        }
    }
}