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
fun CarDetailsScreen(navController: NavController) {
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
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .padding(end = 1.dp,)
                            .weight(1f)
                            .padding(vertical = 9.dp,)
                    ){
                        CoilImage(
                            imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/9f8735b3-6ece-4dee-ad5f-a1cd5ff13eb5"},
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
            Text("Mustang Shelby GT",
                color = Color(0xFF2A2A2A),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(bottom = 7.dp,start = 15.dp,)
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 29.dp,start = 15.dp,)
            ){
                CoilImage(
                    imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/37e67aea-2965-462c-a97d-3cd9a951aee2"},
                    imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                    modifier = Modifier
                        .padding(end = 8.dp,)
                        .width(22.dp)
                        .height(22.dp)
                )
                Text("4.9 (531 reviews)",
                    color = Color(0xFFB8B8B8),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(bottom = 30.dp,start = 23.dp,end = 23.dp,)
                    .fillMaxWidth()
            ){
                CoilImage(
                    imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/34ee8f95-4816-489f-afdd-ec294fd66a54"},
                    imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                    modifier = Modifier
                        .padding(top = 5.dp,bottom = 5.dp,start = 8.dp,end = 23.dp,)
                        .width(7.dp)
                        .height(14.dp)
                )
                CoilImage(
                    imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/431013db-c6e5-460d-a2dd-3466b082da88"},
                    imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                    modifier = Modifier
                        .padding(end = 15.dp,)
                        .width(269.dp)
                        .height(156.dp)
                )
                CoilImage(
                    imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/cde9b392-8332-4bc0-a216-99053e3a63c9"},
                    imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                    modifier = Modifier
                        .padding(vertical = 5.dp,horizontal = 8.dp,)
                        .height(14.dp)
                        .weight(1f)
                )
            }
            Column(
                modifier = Modifier
                    .padding(bottom = 30.dp,start = 15.dp,end = 15.dp,)
                    .fillMaxWidth()
            ){
                Text("Specifications",
                    color = Color(0xFF5A5A5A),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp,)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    OutlinedButton(
                        onClick = { println("Pressed!") },
                        border = BorderStroke(0.dp, Color.Transparent),
                        colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                        contentPadding = PaddingValues(),
                        modifier = Modifier
                            .padding(end = 18.dp,)
                            .border(
                                width = 1.dp,
                                color = Color(0xFFFEC400),
                                shape = RoundedCornerShape(8.dp)
                            )
                            .clip(shape = RoundedCornerShape(8.dp))
                            .weight(1f)
                            .background(
                                color = Color(0x80FFFBE7),
                                shape = RoundedCornerShape(8.dp)
                            )
                    ){
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(vertical = 11.dp,horizontal = 10.dp,)
                        ){
                            CoilImage(
                                imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/fdb58c04-ec98-444d-8f92-4494b4f741f9"},
                                imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                                modifier = Modifier
                                    .padding(bottom = 3.dp,start = 17.dp,end = 17.dp,)
                                    .height(24.dp)
                                    .fillMaxWidth()
                            )
                            Text("Max. power",
                                color = Color(0xFF5A5A5A),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                            )
                            Text("2500hp",
                                color = Color(0xFF5A5A5A),
                                fontSize = 8.sp,
                            )
                        }
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(end = 18.dp,)
                            .border(
                                width = 1.dp,
                                color = Color(0xFFFEC400),
                                shape = RoundedCornerShape(8.dp)
                            )
                            .clip(shape = RoundedCornerShape(8.dp))
                            .weight(1f)
                            .background(
                                color = Color(0x80FFFBE7),
                                shape = RoundedCornerShape(8.dp)
                            )
                            .padding(vertical = 11.dp,horizontal = 13.dp,)
                    ){
                        Column(
                            modifier = Modifier
                                .padding(top = 2.dp,bottom = 5.dp,start = 16.dp,end = 16.dp,)
                                .height(19.dp)
                                .fillMaxWidth()
                                .background(
                                    color = Color(0xFF414141),
                                )
                        ){
                        }
                        Text("Fuel",
                            color = Color(0xFF5A5A5A),
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                        )
                        Text("10km per litre",
                            color = Color(0xFF5A5A5A),
                            fontSize = 8.sp,
                        )
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(end = 18.dp,)
                            .border(
                                width = 1.dp,
                                color = Color(0xFFFEC400),
                                shape = RoundedCornerShape(8.dp)
                            )
                            .clip(shape = RoundedCornerShape(8.dp))
                            .weight(1f)
                            .background(
                                color = Color(0x80FFFBE7),
                                shape = RoundedCornerShape(8.dp)
                            )
                            .padding(11.dp)
                    ){
                        Column(
                            modifier = Modifier
                                .padding(top = 2.dp,bottom = 5.dp,start = 18.dp,end = 18.dp,)
                                .height(19.dp)
                                .fillMaxWidth()
                                .background(
                                    color = Color(0xFF414141),
                                )
                        ){
                        }
                        Text("Max. speed",
                            color = Color(0xFF5A5A5A),
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold,
                        )
                        Text("230kph",
                            color = Color(0xFF5A5A5A),
                            fontSize = 8.sp,
                        )
                    }
                    OutlinedButton(
                        onClick = { println("Pressed!") },
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
                                color = Color(0x80FFFBE7),
                                shape = RoundedCornerShape(8.dp)
                            )
                    ){
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(vertical = 11.dp,horizontal = 15.dp,)
                        ){
                            CoilImage(
                                imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/e8ccb217-6628-458a-8d45-5e72b83087c7"},
                                imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                                modifier = Modifier
                                    .padding(bottom = 3.dp,start = 12.dp,end = 12.dp,)
                                    .height(24.dp)
                                    .fillMaxWidth()
                            )
                            Text("0-60mph",
                                color = Color(0xFF5A5A5A),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold,
                            )
                            Text("2.5sec",
                                color = Color(0xFF5A5A5A),
                                fontSize = 8.sp,
                            )
                        }
                    }
                }
            }
            Text("Car features",
                color = Color(0xFF5A5A5A),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(bottom = 16.dp,start = 15.dp,)
            )
            OutlinedButton(
                onClick = { println("Pressed!") },
                border = BorderStroke(0.dp, Color.Transparent),
                colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                contentPadding = PaddingValues(),
                modifier = Modifier
                    .padding(bottom = 8.dp,start = 15.dp,end = 15.dp,)
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
            ){
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .padding(vertical = 13.dp,horizontal = 15.dp,)
                ){
                    Text("Model",
                        color = Color(0xFF5A5A5A),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(end = 4.dp,)
                            .weight(1f)
                    )
                    Text("GT5000",
                        color = Color(0xFF5A5A5A),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Right,
                        modifier = Modifier
                            .weight(1f)
                    )
                }
            }
            OutlinedButton(
                onClick = { println("Pressed!") },
                border = BorderStroke(0.dp, Color.Transparent),
                colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                contentPadding = PaddingValues(),
                modifier = Modifier
                    .padding(bottom = 8.dp,start = 15.dp,end = 15.dp,)
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
            ){
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .padding(vertical = 13.dp,horizontal = 15.dp,)
                ){
                    Text("Capacity",
                        color = Color(0xFF5A5A5A),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(end = 4.dp,)
                            .weight(1f)
                    )
                    Text("760hp",
                        color = Color(0xFF5A5A5A),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Right,
                        modifier = Modifier
                            .weight(1f)
                    )
                }
            }
            OutlinedButton(
                onClick = { println("Pressed!") },
                border = BorderStroke(0.dp, Color.Transparent),
                colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                contentPadding = PaddingValues(),
                modifier = Modifier
                    .padding(bottom = 8.dp,start = 15.dp,end = 15.dp,)
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
            ){
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .padding(vertical = 13.dp,horizontal = 15.dp,)
                ){
                    Text("Color",
                        color = Color(0xFF5A5A5A),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(end = 4.dp,)
                            .weight(1f)
                    )
                    Text("Red",
                        color = Color(0xFF5A5A5A),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Right,
                        modifier = Modifier
                            .weight(1f)
                    )
                }
            }
            OutlinedButton(
                onClick = { println("Pressed!") },
                border = BorderStroke(0.dp, Color.Transparent),
                colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                contentPadding = PaddingValues(),
                modifier = Modifier
                    .padding(bottom = 8.dp,start = 15.dp,end = 15.dp,)
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
            ){
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .padding(vertical = 13.dp,horizontal = 15.dp,)
                ){
                    Text("Fuel type",
                        color = Color(0xFF5A5A5A),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(end = 4.dp,)
                            .weight(1f)
                    )
                    Text("Octane",
                        color = Color(0xFF5A5A5A),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Right,
                        modifier = Modifier
                            .weight(1f)
                    )
                }
            }
            OutlinedButton(
                onClick = { println("Pressed!") },
                border = BorderStroke(0.dp, Color.Transparent),
                colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                contentPadding = PaddingValues(),
                modifier = Modifier
                    .padding(bottom = 27.dp,start = 15.dp,end = 15.dp,)
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
            ){
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .padding(vertical = 13.dp,horizontal = 15.dp,)
                ){
                    Text("Gear type",
                        color = Color(0xFF5A5A5A),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(end = 4.dp,)
                            .weight(1f)
                    )
                    Text("Automatic",
                        color = Color(0xFF5A5A5A),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Right,
                        modifier = Modifier
                            .weight(1f)
                    )
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Column(
                    horizontalAlignment = Alignment.End,
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    OutlinedButton(
                        onClick = { println("Pressed!") },
                        border = BorderStroke(0.dp, Color.Transparent),
                        colors = ButtonDefaults.outlinedButtonColors(Color.Transparent),
                        contentPadding = PaddingValues(),
                        modifier = Modifier
                            .padding(end = 16.dp,)
                            .clip(shape = RoundedCornerShape(8.dp))
                            .background(
                                color = Color(0xFFEDAE10),
                                shape = RoundedCornerShape(8.dp)
                            )
                    ){
                        Column(
                            modifier = Modifier
                                .padding(vertical = 15.dp,horizontal = 48.dp,)
                        ){
                            Text("Ride Now",
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
}

@Preview(showBackground = true)
@Composable
fun CarDetailsPreview() {
    MaterialTheme {
        CarDetailsScreen(navController = rememberNavController())
    }
}