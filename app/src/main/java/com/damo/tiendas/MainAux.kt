package com.damo.tiendas

interface MainAux {
    fun hideFab(isVisible:Boolean=false)

    //actualizar adapter
    fun addStore(storeEntity: StoreEntity)
    fun updateStore(storeEntity: StoreEntity)
}