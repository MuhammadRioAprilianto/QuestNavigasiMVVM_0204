package com.ktp.navigation.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.ktp.navigation.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick:()->Unit
){
    val items = listOf(
        Pair(stringResource(R.string.nama_lengkap),"Contoh Nama"),
        Pair(stringResource(R.string.jenis_kelamin),"Lainnya"),
        Pair(stringResource(R.string.alamat),"Yogyakarta")
    )
}