package com.example.myapplication
import CategoryAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R



data class Category(val name: String)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val categories = listOf(
                Category("Category 1"),
                Category("Category 2"),
                Category("Category 3"),
                Category("Category 4"),
                Category("Category 5"),
            Category("Category 6"),
            Category("Category 7"),
            Category("Category 8"),
            Category("Category 9"),
            Category("Category 10")
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CategoryAdapter(categories)
    }
}
