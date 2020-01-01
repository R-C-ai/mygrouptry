package com.hsiaoling.mygrouptry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Write a message to the database
//        val database = FirebaseDatabase.getInstance()
//        val user = database.getReference()

        //user.setValue(User())

//        private fun writeNewUser(userId: String, name: String, email: String?)
//        {
//            val user = User(name, email)
//            database.child("users").child(userId).setValue(user)
//        }
//
//        database.child("users").child(userId).child("username").setValue(name)
//
//        val postListener = object : ValueEventListener {
//            override fun onDataChange(dataSnapshot: DataSnapshot) {
//                // Get Post object and use the values to update the UI
//                val post = dataSnapshot.getValue(Post::class.java)
//                // ...
//            }
//
//            override fun onCancelled(databaseError: DatabaseError) {
//                // Getting Post failed, log a message
//                Log.w(TAG, "loadPost:onCancelled", databaseError.toException())
//                // ...
//            }
//        }
//        postReference.addValueEventListener(postListener)

        val user = User("email@gmail.com", "name")
        val database = FirebaseDatabase.getInstance().reference
        database.child("users").child(userId).setValue(user)


        @IgnoreExtraProperties
        data class User(
            var userName: String? = "",
            var userEmail: String? = "",
            var userId: String?=""

)
    }
}
