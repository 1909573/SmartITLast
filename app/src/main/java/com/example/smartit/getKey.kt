package com.example.smartit

class getKey{

    companion object{
        var key:String = "abc"
        var key1:String = "abc"
        fun get():String{
            return getKey.key
        }
        fun get1():String{
            return getKey.key1
        }

    }
}