package com.czxbnb.demoapp.binder

import android.os.IBinder
import android.os.IInterface
import android.os.RemoteException

interface IBookManager : IInterface {
    companion object {
        val DESCRIPTOR = "com.czxbnb.demoapp.binder.IBookManager"
        val TRANSACTION_getBookList = IBinder.FIRST_CALL_TRANSACTION + 0
        val TRANSACTION_addBook = IBinder.FIRST_CALL_TRANSACTION + 1
    }

    @Throws(RemoteException::class)
    fun getBookList(): List<Book>

    @Throws(RemoteException::class)
    fun addBook(book: Book)

}