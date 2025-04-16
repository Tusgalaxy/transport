package com.example.dacs31.ui.screen

import androidx.compose.runtime.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.foundation.text.*
import androidx.compose.material.*
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.ui.*
import androidx.compose.ui.draw.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.font.*
import androidx.compose.ui.unit.*
import androidx.compose.ui.text.style.*
import androidx.compose.ui.layout.*
import androidx.navigation.NavController
import com.skydoves.landscapist.*
import com.skydoves.landscapist.coil.*
@Composable
fun ThanksScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(
                color = Color(0xFFFFFFFF),
            )
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(
                    color = Color(0xFFFFFFFF),
                )
                .verticalScroll(rememberScrollState())
        ){
            Column(
                modifier = Modifier
                    .padding(bottom = 153.dp,)
                    .fillMaxWidth()
            ){
                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .weight(1f)
                            .padding(vertical = 9.dp,)
                    ){
                        CoilImage(
                            imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/cdc51a8b-50f3-4cfb-96e5-7dd0f8a5ce08"},
                            imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                            modifier = Modifier
                                .padding(start = 8.dp,end = 5.dp,)
                                .width(24.dp)
                                .height(24.dp)
                        )
                        Text("Back",
                            color = Color(0xFF414141),
                            fontSize = 16.sp,
                            modifier = Modifier
                                .padding(end = 122.dp,)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .height(42.dp)
                            .weight(1f)
                    ){
                    }
                }
            }
            CoilImage(
                imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/f28e76c2-9181-49dd-b17f-dead60128dbf"},
                imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                modifier = Modifier
                    .padding(bottom = 24.dp,)
                    .width(124.dp)
                    .height(124.dp)
            )
            Text("Thank you",
                color = Color(0xFF2A2A2A),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(bottom = 8.dp,)
            )
            Text("Your booking has been placed sent to \nMd. Sharif Ahmed",
                color = Color(0xFF5A5A5A),
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(bottom = 346.dp,)
                    .width(227.dp)
            )
            OutlinedButton(
                onClick = { println("Pressed!") },
                border = BorderStroke(0.dp, Color.Transparent),
                colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                contentPadding = PaddingValues(),
                modifier = Modifier
                    .padding(horizontal = 16.dp,)
                    .clip(shape = RoundedCornerShape(8.dp))
                    .fillMaxWidth()
                    .background(
                        color = Color(0xFFEDAE10),
                        shape = RoundedCornerShape(8.dp)
                    )
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(vertical = 15.dp,)
                ){
                    Text("Confirm Ride",
                        color = Color(0xFFFFFFFF),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }
        }
    }
}