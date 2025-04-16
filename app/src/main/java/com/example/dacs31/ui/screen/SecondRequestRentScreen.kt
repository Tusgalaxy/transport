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
import androidx.compose.ui.text.*
import androidx.compose.ui.layout.*
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController
import com.skydoves.landscapist.*
import com.skydoves.landscapist.coil.*
@Composable
fun SecondRequestRentScreen(navController: NavController) {
    val textField1 = remember { mutableStateOf("") }
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
                            imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/4c515483-cbcf-4a42-8af8-0b2b3adaf68a"},
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
                    Text("Request for rent",
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
            Row(
                modifier = Modifier
                    .padding(bottom = 2.dp,start = 15.dp,end = 15.dp,)
                    .fillMaxWidth()
                    .padding(start = 12.dp,)
            ){
                Box(
                    modifier = Modifier
                        .padding(top = 19.dp,end = 17.dp,)
                ){
                    Column(
                    ){
                        Box{
                            Column(
                            ){
                                Column(
                                    modifier = Modifier
                                        .width(1.dp)
                                        .height(52.dp)
                                        .background(
                                            color = Color(0xFFFEC400),
                                        )
                                ){
                                }
                            }
                            CoilImage(
                                imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/1b3cca3a-de48-481a-9f43-fbaf009d5651"},
                                imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                                modifier = Modifier
                                    .offset(x = -12.dp, y = 19.dp)
                                    .align(Alignment.BottomStart)
                                    .padding(bottom = 19.dp)
                                    .width(24.dp)
                                    .height(24.dp)
                            )
                        }
                    }
                    CoilImage(
                        imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/2939ad12-643b-418a-977b-d0452fd09623"},
                        imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                        modifier = Modifier
                            .offset(x = -12.dp, y = -19.dp)
                            .align(Alignment.TopStart)
                            .width(24.dp)
                            .height(24.dp)
                    )
                }
                Column(
                    modifier = Modifier
                        .padding(end = 12.dp,)
                        .weight(1f)
                ){
                    Text("Current location",
                        color = Color(0xFF5A5A5A),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 2.dp,)
                    )
                    Text("2972 Westheimer Rd. Santa Ana, Illinois 85486 ",
                        color = Color(0xFFB8B8B8),
                        fontSize = 12.sp,
                        modifier = Modifier
                            .padding(bottom = 23.dp,)
                    )
                    Text("Office",
                        color = Color(0xFF5A5A5A),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
                Text("1.1km",
                    color = Color(0xFF5A5A5A),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(top = 66.dp,)
                )
            }
            Text("1901 Thornridge Cir. Shiloh, Hawaii 81063",
                color = Color(0xFFB8B8B8),
                fontSize = 12.sp,
                modifier = Modifier
                    .padding(bottom = 15.dp,start = 45.dp,)
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 20.dp,start = 15.dp,end = 15.dp,)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFFEC400),
                        shape = RoundedCornerShape(4.dp)
                    )
                    .clip(shape = RoundedCornerShape(4.dp))
                    .fillMaxWidth()
                    .background(
                        color = Color(0xFFFFFAE6),
                        shape = RoundedCornerShape(4.dp)
                    )
                    .padding(12.dp)
            ){
                Column(
                    modifier = Modifier
                        .padding(end = 12.dp,)
                        .weight(1f)
                ){
                    Text("Mustang Shelby GT",
                        color = Color(0xFF5A5A5A),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 8.dp,)
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(start = 2.dp,)
                    ){
                        CoilImage(
                            imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/9a4dc284-3336-454e-b6c5-82f2bf485cde"},
                            imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                            modifier = Modifier
                                .padding(end = 8.dp,)
                                .width(16.dp)
                                .height(16.dp)
                        )
                        Text("4.9 (531 reviews)",
                            color = Color(0xFFB8B8B8),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                }
                CoilImage(
                    imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/92aa1428-f659-4aaf-a328-12f35105ee1a"},
                    imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                    modifier = Modifier
                        .width(93.dp)
                        .height(54.dp)
                )
            }
            Text("Charge",
                color = Color(0xFF5A5A5A),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(bottom = 10.dp,start = 15.dp,)
            )
            Column(
                modifier = Modifier
                    .padding(bottom = 22.dp,start = 15.dp,end = 15.dp,)
                    .fillMaxWidth()
            ){
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(bottom = 9.dp,)
                        .fillMaxWidth()
                ){
                    Text("Mustang/per hours",
                        color = Color(0xFF5A5A5A),
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(end = 4.dp,)
                            .weight(1f)
                    )
                    Text("$200",
                        color = Color(0xFF5A5A5A),
                        fontSize = 14.sp,
                        textAlign = TextAlign.Right,
                        modifier = Modifier
                            .weight(1f)
                    )
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(bottom = 9.dp,)
                        .fillMaxWidth()
                ){
                    Text("Vat (5%)",
                        color = Color(0xFF5A5A5A),
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(end = 4.dp,)
                            .weight(1f)
                    )
                    Text("$20",
                        color = Color(0xFF5A5A5A),
                        fontSize = 14.sp,
                        textAlign = TextAlign.Right,
                        modifier = Modifier
                            .weight(1f)
                    )
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Text("Promo Code",
                        color = Color(0xFF5A5A5A),
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(end = 4.dp,)
                            .weight(1f)
                    )
                    Text("-$5",
                        color = Color(0xFF5A5A5A),
                        fontSize = 14.sp,
                        textAlign = TextAlign.Right,
                        modifier = Modifier
                            .weight(1f)
                    )
                }
            }
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 24.dp,start = 15.dp,end = 15.dp,)
                    .fillMaxWidth()
            ){
                Text("Select payment method",
                    color = Color(0xFF5A5A5A),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(end = 4.dp,)
                        .weight(1f)
                )
                Text("View All",
                    color = Color(0xFFF4BD05),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Right,
                    modifier = Modifier
                        .weight(1f)
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 8.dp,start = 15.dp,end = 15.dp,)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFFEC400),
                        shape = RoundedCornerShape(4.dp)
                    )
                    .clip(shape = RoundedCornerShape(4.dp))
                    .fillMaxWidth()
                    .background(
                        color = Color(0xFFFFFAE6),
                        shape = RoundedCornerShape(4.dp)
                    )
                    .padding(vertical = 11.dp,horizontal = 17.dp,)
            ){
                CoilImage(
                    imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/3ad89913-b080-490f-8fcc-649d151f16cf"},
                    imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                    modifier = Modifier
                        .padding(end = 13.dp,)
                        .width(45.dp)
                        .height(35.dp)
                )
                Column(
                ){
                    Text("**** **** **** 8970",
                        color = Color(0xFF5A5A5A),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Text("Expires: 12/26",
                        color = Color(0xFFB8B8B8),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 8.dp,start = 15.dp,end = 15.dp,)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFFEC400),
                        shape = RoundedCornerShape(4.dp)
                    )
                    .clip(shape = RoundedCornerShape(4.dp))
                    .fillMaxWidth()
                    .background(
                        color = Color(0xFFFFFAE6),
                        shape = RoundedCornerShape(4.dp)
                    )
                    .padding(vertical = 11.dp,horizontal = 17.dp,)
            ){
                CoilImage(
                    imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/c5dc2eab-97cd-4113-8e61-32cbab6efb69"},
                    imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                    modifier = Modifier
                        .padding(end = 13.dp,)
                        .width(45.dp)
                        .height(35.dp)
                )
                Column(
                ){
                    Text("**** **** **** 8970",
                        color = Color(0xFF5A5A5A),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Text("Expires: 12/26",
                        color = Color(0xFFB8B8B8),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 8.dp,start = 15.dp,end = 15.dp,)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFFEC400),
                        shape = RoundedCornerShape(4.dp)
                    )
                    .clip(shape = RoundedCornerShape(4.dp))
                    .fillMaxWidth()
                    .background(
                        color = Color(0xFFFFFAE6),
                        shape = RoundedCornerShape(4.dp)
                    )
                    .padding(vertical = 11.dp,horizontal = 17.dp,)
            ){
                CoilImage(
                    imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/9baa54d5-7ddd-4031-ae4a-a4462e8168ec"},
                    imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                    modifier = Modifier
                        .padding(top = 2.dp,start = 5.dp,end = 18.dp,)
                        .width(38.dp)
                        .height(32.dp)
                )
                Column(
                ){
                    Text("My Wallet ",
                        color = Color(0xFF5A5A5A),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                    )
                    Text("$349",
                        color = Color(0xFFB8B8B8),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                    )
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 29.dp,start = 15.dp,end = 15.dp,)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFFEC400),
                        shape = RoundedCornerShape(4.dp)
                    )
                    .clip(shape = RoundedCornerShape(4.dp))
                    .fillMaxWidth()
                    .background(
                        color = Color(0xFFFFFAE6),
                        shape = RoundedCornerShape(4.dp)
                    )
                    .padding(vertical = 8.dp,horizontal = 15.dp,)
            ){
                CoilImage(
                    imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/aa6da291-a801-4da0-8bdc-6456548e9c49"},
                    imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                    modifier = Modifier
                        .padding(end = 11.dp,)
                        .width(45.dp)
                        .height(43.dp)
                )
                TextFieldView(
                    placeholder = "Cash",
                    value = textField1.value,
                    onValueChange = { newText -> textField1.value = newText },
                    textStyle = TextStyle(
                        color = Color(0xFF5A5A5A),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                    modifier = Modifier
                        .weight(1f)
                        .padding(vertical = 11.dp,)
                )
            }
            OutlinedButton(
                onClick = { println("Pressed!") },
                border = BorderStroke(0.dp, Color.Transparent),
                colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                contentPadding = PaddingValues(),
                modifier = Modifier
                    .padding(bottom = 14.dp,start = 15.dp,end = 15.dp,)
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