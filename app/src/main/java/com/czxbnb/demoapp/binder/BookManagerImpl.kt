package com.czxbnb.demoapp.binder

import android.os.Binder
import android.os.IBinder
import com.czxbnb.demoapp.binder.IBookManager.Companion.DESCRIPTOR

class BookManagerImpl : Binder, IBookManager {

    constructor() {
        this.attachInterface(this, DESCRIPTOR)
    }

   companion object {
       fun asInterface(obj: IBinder)
   }

    override fun asBinder(): IBinder {

    }

    override fun getBookList(): List<Book> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addBook(book: Book) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}