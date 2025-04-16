package com.example.dacs31

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dacs31.ui.screen.AvailableCarListScreen
import com.example.dacs31.ui.screen.AvailableCarScreen
import com.example.dacs31.ui.screen.CarDetailsScreen
import com.example.dacs31.ui.screen.FirstRequestRentScreen
import com.example.dacs31.ui.screen.PaymentMethodScreen
import com.example.dacs31.ui.screen.SecondRequestRentScreen
import com.example.dacs31.ui.screen.SelectTransportScreen
import com.example.dacs31.ui.screen.ThanksScreen
import com.example.dacs31.ui.theme.DACS31Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DACS31Theme {
                MainApp()
            }
        }
    }
}

@Composable
fun MainApp() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "transport"
    ) {
        composable("transport") {
            SelectTransportScreen(navController = navController)
        }
        composable("avail") {
            AvailableCarScreen(navController = navController)
        }
        composable("avail_list") {
            AvailableCarListScreen(navController = navController)
        }
        composable("details") {
            CarDetailsScreen(navController = navController)
        }
        composable("first_rent") {
            FirstRequestRentScreen(navController = navController)
        }
        composable("second_rent") {
            SecondRequestRentScreen(navController = navController)
        }
        // Các màn hình khác trong BottomNavigation
        composable("payment") {
            PaymentMethodScreen(navController = navController)
        }
        composable("thanks") {
            ThanksScreen(navController = navController)
        }
        composable("offer") {
            // TODO: Thêm OfferScreen
        }
    }
}