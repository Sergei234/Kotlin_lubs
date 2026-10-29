package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class User(
    val name: String,
    val profession: String,
    val stats: List<Pair<String, String>>,
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            val users = listOf(
                User(
                    name = "Тилек Абдрахманов",
                    profession = "Android-разработчик",
                    stats = listOf("12" to "проектов", "48" to "задач", "5" to "лет опыта"),
                ),
                User(
                    name = "Айгерим Бекова",
                    profession = "UI/UX-дизайнер",
                    stats = listOf("20" to "проектов", "95" to "задач", "7" to "лет опыта"),
                ),
                User(
                    name = "Нурлан Сыдыков",
                    profession = "Backend-разработчик",
                    stats = listOf("8" to "проектов", "33" to "задач", "3" to "лет опыта"),
                ),
            )

            Column(
                modifier = Modifier
                    .padding(top = 48.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {

                users.forEach { user ->

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                            .clip(RoundedCornerShape(20.dp))
                            .background(Color.LightGray)
                            .padding(16.dp),
                    ) {

                        Column(
                            modifier = Modifier.fillMaxWidth(),
                            verticalArrangement = Arrangement.spacedBy(16.dp),
                        ) {

                            // аватар + имя и профессия
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.spacedBy(16.dp),
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(64.dp)
                                        .clip(CircleShape)
                                        .background(Color.Blue),
                                    contentAlignment = Alignment.Center,
                                ) {
                                    Text(
                                        text = user.name.first().toString(),
                                        color = Color.White,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 28.sp,
                                    )
                                }

                                Column {
                                    Text(
                                        text = user.name,
                                        color = Color.Black,
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp,
                                    )
                                    Text(
                                        text = user.profession,
                                        color = Color.Gray,
                                        fontSize = 14.sp,
                                    )
                                }
                            }

                            // статистика
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                            ) {
                                user.stats.forEach { stat ->
                                    Column(
                                        modifier = Modifier.weight(1f),
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                    ) {
                                        Text(
                                            text = stat.first,
                                            color = Color.Blue,
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 22.sp,
                                        )
                                        Text(
                                            text = stat.second,
                                            color = Color.Gray,
                                            fontSize = 12.sp,
                                        )
                                    }
                                }
                            }

                            // кнопки
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.spacedBy(12.dp),
                            ) {
                                Button(
                                    onClick = { },
                                    modifier = Modifier.weight(1f),
                                ) {
                                    Text(text = "Написать")
                                }

                                OutlinedButton(
                                    onClick = { },
                                    modifier = Modifier.weight(1f),
                                ) {
                                    Text(text = "Подписаться")
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}