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
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.*
import androidx.compose.ui.draw.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.font.*
import androidx.compose.ui.unit.*
import androidx.compose.ui.text.*
import androidx.compose.ui.text.style.*
import androidx.compose.ui.layout.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.skydoves.landscapist.*
import com.skydoves.landscapist.coil.*
@Composable
fun FirstRequestRentScreen(navController: NavController) {
    val textField1 = remember { mutableStateOf("") }
    val textField2 = remember { mutableStateOf("") }
    val textField3 = remember { mutableStateOf("") }
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
                            imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/19f34300-3734-4984-a299-82416578402f"},
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
                                imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/c685007a-dd3a-4625-9960-7e0dcb9182e8"},
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
                        imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/3788a6af-de30-4240-bdfe-3f714699aa89"},
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
                    .padding(bottom = 20.dp,start = 45.dp,)
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 14.dp,start = 15.dp,end = 15.dp,)
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
                            imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/7dc9d2dd-eb59-42c4-bf73-7c3ac1ceae2b"},
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
                    imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/7d995cc2-f739-4926-9273-92fada598709"},
                    imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                    modifier = Modifier
                        .width(93.dp)
                        .height(54.dp)
                )
            }
            Row(
                modifier = Modifier
                    .padding(bottom = 16.dp,start = 15.dp,end = 15.dp,)
                    .fillMaxWidth()
            ){
                TextFieldView(
                    placeholder = "Date",
                    value = textField1.value,
                    onValueChange = { newText -> textField1.value = newText },
                    textStyle = TextStyle(
                        color = Color(0xFFD0D0D0),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                    modifier = Modifier
                        .padding(end = 16.dp,)
                        .border(
                            width = 1.dp,
                            color = Color(0xFFB8B8B8),
                            shape = RoundedCornerShape(8.dp)
                        )
                        .clip(shape = RoundedCornerShape(8.dp))
                        .weight(1f)
                        .padding(top = 19.dp,bottom = 19.dp,start = 9.dp,end = 18.dp,)
                )
                TextFieldView(
                    placeholder = "Time",
                    value = textField2.value,
                    onValueChange = { newText -> textField2.value = newText },
                    textStyle = TextStyle(
                        color = Color(0xFFD0D0D0),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                    ),
                    modifier = Modifier
                        .border(
                            width = 1.dp,
                            color = Color(0xFFB8B8B8),
                            shape = RoundedCornerShape(8.dp)
                        )
                        .clip(shape = RoundedCornerShape(8.dp))
                        .weight(1f)
                        .padding(top = 19.dp,bottom = 19.dp,start = 9.dp,end = 18.dp,)
                )
            }
            OutlinedButton(
                onClick = { println("Pressed!") },
                border = BorderStroke(0.dp, Color.Transparent),
                colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                contentPadding = PaddingValues(),
                modifier = Modifier
                    .padding(bottom = 42.dp,start = 15.dp,end = 15.dp,)
                    .border(
                        width = 1.dp,
                        color = Color(0xFFB8B8B8),
                        shape = RoundedCornerShape(8.dp)
                    )
                    .clip(shape = RoundedCornerShape(8.dp))
                    .fillMaxWidth()
            ){
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(vertical = 18.dp,horizontal = 20.dp,)
                ){
                    Text("Enter Promo Code",
                        color = Color(0xFFD0D0D0),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .weight(1f)
                    )
                    CoilImage(
                        imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/ef33d614-d91b-4274-9882-756906327e42"},
                        imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                        modifier = Modifier
                            .width(24.dp)
                            .height(24.dp)
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
                    imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/39eeb9d9-0299-4199-9c2d-55fef0c85611"},
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
                    imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/003aca59-a033-48b0-86e5-ae7501a621a1"},
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
                    imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/1e7f0f87-5bfc-4bce-acdb-b587b4c3fea8"},
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
                    .padding(bottom = 26.dp,start = 15.dp,end = 15.dp,)
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
                    imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/8dd0a966-4458-4f53-b6f4-fce149a93db4"},
                    imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                    modifier = Modifier
                        .padding(end = 11.dp,)
                        .width(45.dp)
                        .height(43.dp)
                )
                TextFieldView(
                    placeholder = "Cash",
                    value = textField3.value,
                    onValueChange = { newText -> textField3.value = newText },
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
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ){
                OutlinedButton(
                    onClick = { println("Pressed!") },
                    border = BorderStroke(0.dp, Color.Transparent),
                    colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                    contentPadding = PaddingValues(),
                    modifier = Modifier
                        .padding(horizontal = 15.dp,)
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
                        Text("Confirm Booking",
                            color = Color(0xFFFFFFFF),
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
fun FirstRequestRentPreview() {
    MaterialTheme {
        FirstRequestRentScreen(navController = rememberNavController())
    }
}