package com.example.dacs31.ui.screen

import androidx.compose.runtime.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.foundation.text.*
import androidx.compose.material.*
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.ui.*
import androidx.compose.ui.draw.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.font.*
import androidx.compose.ui.unit.*
import androidx.compose.ui.text.style.*
import androidx.compose.ui.layout.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.skydoves.landscapist.*
import com.skydoves.landscapist.coil.*
@Composable
fun SelectTransportScreen(navController: NavController) {
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
                    .padding(bottom = 30.dp,)
                    .fillMaxWidth()
            ){
                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(vertical = 9.dp,horizontal = 8.dp,)
                    ){
                        CoilImage(
                            imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/bba57034-00aa-479b-b5f2-8547c7358d1b"},
                            imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                            modifier = Modifier
                                .padding(end = 5.dp,)
                                .width(24.dp)
                                .height(24.dp)
                        )
                        Text("Back",
                            color = Color(0xFF414141),
                            fontSize = 16.sp,
                        )
                    }
                    Text("Select transport",
                        color = Color(0xFF2A2A2A),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .weight(1f)
                    )
                    Column(
                        modifier = Modifier
                            .width(101.dp)
                            .height(42.dp)
                    ){
                    }
                }
            }
            Text("Select your transport",
                color = Color(0xFF2A2A2A),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(bottom = 40.dp,)
            )
            Row(
                modifier = Modifier
                    .padding(bottom = 20.dp,start = 26.dp,end = 26.dp,)
                    .fillMaxWidth()
            ){
                OutlinedButton(
                    onClick = { navController.navigate("avail") },
                    border = BorderStroke(0.dp, Color.Transparent),
                    colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                    contentPadding = PaddingValues(),
                    modifier = Modifier
                        .padding(end = 20.dp,)
                        .border(
                            width = 1.dp,
                            color = Color(0xFFFEC400),
                            shape = RoundedCornerShape(8.dp)
                        )
                        .clip(shape = RoundedCornerShape(8.dp))
                        .weight(1f)
                        .background(
                            color = Color(0xFFFFF1B1),
                            shape = RoundedCornerShape(8.dp)
                        )
                ){
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(vertical = 26.dp,horizontal = 43.dp,)
                    ){
                        CoilImage(
                            imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/b8af03e6-e052-4628-ae02-4bb6bd234d1b"},
                            imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                            modifier = Modifier
                                .padding(bottom = 10.dp,)
                                .height(74.dp)
                                .fillMaxWidth()
                        )
                        Text("Car",
                            color = Color(0xFF5A5A5A),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
                OutlinedButton(
                    onClick = { navController.navigate("avail") },
                    border = BorderStroke(0.dp, Color.Transparent),
                    colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                    contentPadding = PaddingValues(),
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0xFFFEC400),
                            shape = RoundedCornerShape(8.dp)
                        )
                        .clip(shape = RoundedCornerShape(8.dp))
                        .weight(1f)
                        .background(
                            color = Color(0xFFFFFAE6),
                            shape = RoundedCornerShape(8.dp)
                        )
                ){
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(vertical = 26.dp,horizontal = 43.dp,)
                    ){
                        CoilImage(
                            imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/e6154c4a-ddf4-4cca-be79-3d3f8801e63a"},
                            imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                            modifier = Modifier
                                .padding(bottom = 10.dp,)
                                .height(74.dp)
                                .fillMaxWidth()
                        )
                        Text("Bike",
                            color = Color(0xFF5A5A5A),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .padding(bottom = 284.dp,start = 26.dp,end = 26.dp,)
                    .fillMaxWidth()
            ){
                OutlinedButton(
                    onClick = { navController.navigate("avail") },
                    border = BorderStroke(0.dp, Color.Transparent),
                    colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                    contentPadding = PaddingValues(),
                    modifier = Modifier
                        .padding(end = 20.dp,)
                        .border(
                            width = 1.dp,
                            color = Color(0xFFFEC400),
                            shape = RoundedCornerShape(8.dp)
                        )
                        .clip(shape = RoundedCornerShape(8.dp))
                        .weight(1f)
                        .background(
                            color = Color(0xFFFFFAE6),
                            shape = RoundedCornerShape(8.dp)
                        )
                ){
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(vertical = 26.dp,horizontal = 43.dp,)
                    ){
                        CoilImage(
                            imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/f170b7a2-43a5-4ce0-8cd0-32a627e53d48"},
                            imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                            modifier = Modifier
                                .padding(bottom = 10.dp,)
                                .height(74.dp)
                                .fillMaxWidth()
                        )
                        Text("Cycle",
                            color = Color(0xFF5A5A5A),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
                OutlinedButton(
                    onClick = { navController.navigate("avail") },
                    border = BorderStroke(0.dp, Color.Transparent),
                    colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                    contentPadding = PaddingValues(),
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0xFFFEC400),
                            shape = RoundedCornerShape(8.dp)
                        )
                        .clip(shape = RoundedCornerShape(8.dp))
                        .weight(1f)
                        .background(
                            color = Color(0xFFFFFAE6),
                            shape = RoundedCornerShape(8.dp)
                        )
                ){
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(vertical = 26.dp,horizontal = 43.dp,)
                    ){
                        CoilImage(
                            imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/b0935552-7aa2-453a-a6ee-c1e116910826"},
                            imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                            modifier = Modifier
                                .padding(bottom = 10.dp,)
                                .height(74.dp)
                                .fillMaxWidth()
                        )
                        Text("Taxi",
                            color = Color(0xFF5A5A5A),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SelectTransportPreview() {
    MaterialTheme {
        SelectTransportScreen(navController = rememberNavController())
    }
}