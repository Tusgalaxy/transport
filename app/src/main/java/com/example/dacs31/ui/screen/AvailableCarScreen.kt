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
import androidx.compose.ui.layout.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.skydoves.landscapist.*
import com.skydoves.landscapist.coil.*
@Composable
fun AvailableCarScreen(navController: NavController) {
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
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Spacer(modifier = Modifier.height(16.dp))

                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(end = 1.dp,)
                            .weight(1f)
                            .padding(vertical = 9.dp,)
                    ){
                        CoilImage(
                            imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/365bae66-4cc5-4abf-b01e-4d8ef9449234"},
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
            Text("Available cars for ride",
                color = Color(0xFF2A2A2A),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(bottom = 8.dp,start = 26.dp,)
            )
            Text("18 cars found",
                color = Color(0xFFB8B8B8),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(bottom = 30.dp,start = 26.dp,)
            )
            Column(
                modifier = Modifier
                    .padding(bottom = 20.dp,start = 15.dp,end = 15.dp,)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFFEC400),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .clip(shape = RoundedCornerShape(8.dp))
                    .fillMaxWidth()
                    .background(
                        color = Color(0x80FFFBE7),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .padding(vertical = 13.dp,)
            ){
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(bottom = 24.dp,start = 10.dp,)
                ){
                    Column(
                        modifier = Modifier
                            .padding(end = 31.dp,)
                    ){
                        Text("BMW Cabrio",
                            color = Color(0xFF5A5A5A),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(bottom = 1.dp,)
                        )
                        Text("Automatic   |   3 seats   |   Octane",
                            color = Color(0xFFB8B8B8),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(bottom = 5.dp,)
                        )
                        Row(
                        ){
                            CoilImage(
                                imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/b6df7529-f8cc-4cad-9596-cf6a2daf0307"},
                                imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                                modifier = Modifier
                                    .padding(end = 3.dp,)
                                    .width(16.dp)
                                    .height(16.dp)
                            )
                            Text("800m (5mins away)",
                                color = Color(0xFF414141),
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                    }
                    CoilImage(
                        imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/543f2b68-faf2-4fcf-8df1-89a694c120be"},
                        imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                        modifier = Modifier
                            .width(101.dp)
                            .height(59.dp)
                    )
                }
                OutlinedButton(
                    onClick = { navController.navigate("avail_list") },
                    border = BorderStroke(0.dp, Color.Transparent),
                    colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                    contentPadding = PaddingValues(),
                    modifier = Modifier
                        .padding(horizontal = 10.dp,)
                        .border(
                            width = 1.dp,
                            color = Color(0xFFEDAE10),
                            shape = RoundedCornerShape(8.dp)
                        )
                        .clip(shape = RoundedCornerShape(8.dp))
                        .fillMaxWidth()
                ){
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(vertical = 15.dp,)
                    ){
                        Text("View car list",
                            color = Color(0xFFEDAE10),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
            }
            Column(
                modifier = Modifier
                    .padding(bottom = 20.dp,start = 15.dp,end = 15.dp,)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFFEC400),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .clip(shape = RoundedCornerShape(8.dp))
                    .fillMaxWidth()
                    .background(
                        color = Color(0x80FFFBE7),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .padding(vertical = 13.dp,)
            ){
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(bottom = 24.dp,start = 10.dp,)
                ){
                    Column(
                        modifier = Modifier
                            .padding(end = 31.dp,)
                    ){
                        Text("Mustang Shelby GT",
                            color = Color(0xFF5A5A5A),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(bottom = 1.dp,)
                        )
                        Text("Automatic   |   3 seats   |   Octane",
                            color = Color(0xFFB8B8B8),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(bottom = 5.dp,)
                        )
                        Row(
                        ){
                            CoilImage(
                                imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/48d1715f-3576-4bb8-9526-0a057f3b3efd"},
                                imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                                modifier = Modifier
                                    .padding(end = 3.dp,)
                                    .width(16.dp)
                                    .height(16.dp)
                            )
                            Text("800m (5mins away)",
                                color = Color(0xFF414141),
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                    }
                    CoilImage(
                        imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/a942d091-f8a5-41f5-aef1-2561ce1ac55a"},
                        imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                        modifier = Modifier
                            .width(101.dp)
                            .height(59.dp)
                    )
                }
                OutlinedButton(
                    onClick = { navController.navigate("avail_list") },
                    border = BorderStroke(0.dp, Color.Transparent),
                    colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                    contentPadding = PaddingValues(),
                    modifier = Modifier
                        .padding(horizontal = 10.dp,)
                        .border(
                            width = 1.dp,
                            color = Color(0xFFEDAE10),
                            shape = RoundedCornerShape(8.dp)
                        )
                        .clip(shape = RoundedCornerShape(8.dp))
                        .fillMaxWidth()
                ){
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(vertical = 15.dp,)
                    ){
                        Text("View car list",
                            color = Color(0xFFEDAE10),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
            }
            Column(
                modifier = Modifier
                    .padding(bottom = 20.dp,start = 15.dp,end = 15.dp,)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFFEC400),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .clip(shape = RoundedCornerShape(8.dp))
                    .fillMaxWidth()
                    .background(
                        color = Color(0x80FFFBE7),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .padding(vertical = 13.dp,)
            ){
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(bottom = 24.dp,start = 10.dp,)
                ){
                    Column(
                        modifier = Modifier
                            .padding(end = 31.dp,)
                    ){
                        Text("BMW 18",
                            color = Color(0xFF5A5A5A),
                            fontSize = 16.sp,
                            modifier = Modifier
                                .padding(bottom = 1.dp,)
                        )
                        Text("Automatic   |   3 seats   |   Octane",
                            color = Color(0xFFB8B8B8),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(bottom = 5.dp,)
                        )
                        Row(
                        ){
                            CoilImage(
                                imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/87466f9e-7d52-409b-ae5d-eb2980889ce0"},
                                imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                                modifier = Modifier
                                    .padding(end = 3.dp,)
                                    .width(16.dp)
                                    .height(16.dp)
                            )
                            Text("800m (5mins away)",
                                color = Color(0xFF414141),
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                    }
                    CoilImage(
                        imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/3baa78c1-7d0c-45eb-ba7c-21edd881a699"},
                        imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                        modifier = Modifier
                            .width(101.dp)
                            .height(59.dp)
                    )
                }
                OutlinedButton(
                    onClick = { navController.navigate("avail_list") },
                    border = BorderStroke(0.dp, Color.Transparent),
                    colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                    contentPadding = PaddingValues(),
                    modifier = Modifier
                        .padding(horizontal = 10.dp,)
                        .border(
                            width = 1.dp,
                            color = Color(0xFFEDAE10),
                            shape = RoundedCornerShape(8.dp)
                        )
                        .clip(shape = RoundedCornerShape(8.dp))
                        .fillMaxWidth()
                ){
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(vertical = 15.dp,)
                    ){
                        Text("View car list",
                            color = Color(0xFFEDAE10),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .padding(horizontal = 15.dp,)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFFEC400),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .clip(shape = RoundedCornerShape(8.dp))
                    .fillMaxWidth()
                    .background(
                        color = Color(0x80FFFBE7),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .padding(horizontal = 10.dp,)
            ){
                Column(
                    modifier = Modifier
                        .padding(top = 16.dp,end = 12.dp,)
                        .weight(1f)
                ){
                    Text("Jaguar Silber",
                        color = Color(0xFF5A5A5A),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 1.dp,)
                    )
                    Text("Automatic   |   3 seats   |   Octane",
                        color = Color(0xFFB8B8B8),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 5.dp,)
                    )
                    Row(
                    ){
                        CoilImage(
                            imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/bc1ba74e-3c9a-49c9-9053-ab4a8b4486b5"},
                            imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                            modifier = Modifier
                                .padding(end = 3.dp,)
                                .width(16.dp)
                                .height(8.dp)
                        )
                        Text("800m (5mins away)",
                            color = Color(0xFF414141),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
                CoilImage(
                    imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/d8ac1cc9-3cdf-436c-b7f2-10107bc4619c"},
                    imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                    modifier = Modifier
                        .padding(top = 13.dp,)
                        .width(101.dp)
                        .height(58.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AvailableCarPreview() {
    MaterialTheme {
        AvailableCarScreen(navController = rememberNavController())
    }
}