package com.example.dacs31.ui.screen

import androidx.compose.runtime.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.foundation.text.*
import androidx.compose.material.*
import androidx.compose.material3.MaterialTheme
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
fun AvailableCarListScreen(navController: NavController) {
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
                            imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/fabd0677-3253-4256-a8cb-05666239f988"},
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
                                imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/9fde383f-892c-4695-9850-a3a486104963"},
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
                        imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/989e6f9a-5f03-45dc-a45f-522e6b358a50"},
                        imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                        modifier = Modifier
                            .width(101.dp)
                            .height(59.dp)
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(horizontal = 10.dp,)
                        .fillMaxWidth()
                ){
                    Column(
                        modifier = Modifier
                            .padding(end = 7.dp,)
                            .border(
                                width = 1.dp,
                                color = Color(0xFFEDAE10),
                                shape = RoundedCornerShape(8.dp)
                            )
                            .clip(shape = RoundedCornerShape(8.dp))
                            .weight(1f)
                            .padding(vertical = 15.dp,)
                    ){
                        Text("Book later",
                            color = Color(0xFFEDAE10),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(horizontal = 45.dp,)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(8.dp))
                            .weight(1f)
                            .background(
                                color = Color(0xFFEDAE10),
                                shape = RoundedCornerShape(8.dp)
                            )
                            .padding(vertical = 15.dp,)
                    ){
                        Text("Ride Now",
                            color = Color(0xFFFFFFFF),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(horizontal = 45.dp,)
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
                                imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/51de85b1-6d32-42fc-88f2-762c1e551956"},
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
                        imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/a09e07ad-64d8-4d03-b080-68c9f1becdcb"},
                        imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                        modifier = Modifier
                            .width(101.dp)
                            .height(59.dp)
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(horizontal = 10.dp,)
                        .fillMaxWidth()
                ){
                    Column(
                        modifier = Modifier
                            .padding(end = 7.dp,)
                            .border(
                                width = 1.dp,
                                color = Color(0xFFEDAE10),
                                shape = RoundedCornerShape(8.dp)
                            )
                            .clip(shape = RoundedCornerShape(8.dp))
                            .weight(1f)
                            .padding(vertical = 15.dp,)
                    ){
                        Text("Book later",
                            color = Color(0xFFEDAE10),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(horizontal = 45.dp,)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(8.dp))
                            .weight(1f)
                            .background(
                                color = Color(0xFFEDAE10),
                                shape = RoundedCornerShape(8.dp)
                            )
                            .padding(vertical = 15.dp,)
                    ){
                        Text("Ride Now",
                            color = Color(0xFFFFFFFF),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(horizontal = 45.dp,)
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
                                imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/136a1853-ff26-40c1-96d1-e975f439cebe"},
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
                        imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/64029284-9a2c-4e80-a302-d497d19e65d3"},
                        imageOptions = ImageOptions(contentScale = ContentScale.Crop),
                        modifier = Modifier
                            .width(101.dp)
                            .height(59.dp)
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(horizontal = 10.dp,)
                        .fillMaxWidth()
                ){
                    Column(
                        modifier = Modifier
                            .padding(end = 7.dp,)
                            .border(
                                width = 1.dp,
                                color = Color(0xFFEDAE10),
                                shape = RoundedCornerShape(8.dp)
                            )
                            .clip(shape = RoundedCornerShape(8.dp))
                            .weight(1f)
                            .padding(vertical = 15.dp,)
                    ){
                        Text("Book later",
                            color = Color(0xFFEDAE10),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(horizontal = 45.dp,)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .clip(shape = RoundedCornerShape(8.dp))
                            .weight(1f)
                            .background(
                                color = Color(0xFFEDAE10),
                                shape = RoundedCornerShape(8.dp)
                            )
                            .padding(vertical = 15.dp,)
                    ){
                        Text("Ride Now",
                            color = Color(0xFFFFFFFF),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(horizontal = 45.dp,)
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
                            imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/3ad08023-025e-4924-9c48-49b8a6fd7254"},
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
                    imageModel = {"https://figma-alpha-api.s3.us-west-2.amazonaws.com/images/44f749f4-86c2-4e2b-bd50-2b927007b1d2"},
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
fun AvailableCarListPreview() {
    MaterialTheme {
        AvailableCarListScreen(navController = rememberNavController())
    }
}