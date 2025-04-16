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
import androidx.navigation.NavController
import com.skydoves.landscapist.*
import com.skydoves.landscapist.coil.*
@Composable
fun PaymentMethodScreen(navController: NavController) {
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
                    .padding(bottom = 17.dp,)
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
                            .padding(end = 1.dp,)
                            .weight(1f)
                            .padding(vertical = 9.dp,)
                    ){
                        CoilImage(
                            imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/150bbfd4-282a-4bb3-bb9c-322aa8605b1f"},
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
            Text("Select payment method",
                color = Color(0xFF2A2A2A),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(bottom = 8.dp,start = 15.dp,)
            )
            Text("Select payment method you want to use",
                color = Color(0xFFB8B8B8),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(bottom = 35.dp,start = 15.dp,)
            )
            Column(
                modifier = Modifier
                    .padding(bottom = 147.dp,start = 15.dp,end = 15.dp,)
                    .fillMaxWidth()
            ){
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(bottom = 8.dp,)
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
                        imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/4c8cccbb-f1d5-40a2-827b-b463a6fae5cc"},
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
                        .padding(bottom = 8.dp,)
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
                        imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/bca3536b-8eb5-47c9-b78c-af2db69f2963"},
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
                        .padding(bottom = 8.dp,)
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
                        imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/942421dd-d9ce-4b55-b387-edbceabda8be"},
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
                        .padding(bottom = 8.dp,)
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
                        imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/7d15c4b5-5eb0-4488-986f-7145f46150f1"},
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
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .padding(bottom = 8.dp,)
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
                        imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/b8d1ff6a-806a-4d13-8147-e050e39be544"},
                        imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                        modifier = Modifier
                            .padding(end = 13.dp,)
                            .width(45.dp)
                            .height(35.dp)
                    )
                    Column(
                    ){
                        Text("mailaddress@mail.com",
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
                        .padding(bottom = 8.dp,)
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
                        imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/ad4144d8-5bfc-409f-9ed2-90708e2557ff"},
                        imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                        modifier = Modifier
                            .padding(top = 2.dp,bottom = 2.dp,end = 21.dp,)
                            .width(34.dp)
                            .height(29.dp)
                    )
                    TextFieldView(
                        placeholder = "Google Pay",
                        value = textField2.value,
                        onValueChange = { newText -> textField2.value = newText },
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
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
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
                        imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/681e40d7-e602-4914-bfce-f5b2c42f5450"},
                        imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                        modifier = Modifier
                            .padding(end = 21.dp,)
                            .width(35.dp)
                            .height(35.dp)
                    )
                    TextFieldView(
                        placeholder = "Phone Pay",
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