package com.example.odev4.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun SayfaGecisleri(secilenSayfa:String){
    val navController = rememberNavController()

    NavHost(navController= navController, startDestination = secilenSayfa) {

        composable("anasayfa"){
            Anasayfa(navController = navController)
        }
        composable("sayfaa"){
            SayfaA(navController= navController)
        }
        composable("sayfaB"){
            SayfaB(navController= navController)
        }
        composable("sayfaX"){
            SayfaX(navController= navController)
        }
        composable("sayfaY"){
            SayfaY(navController= navController)
        }

    }

}