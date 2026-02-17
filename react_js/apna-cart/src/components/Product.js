import React from 'react'
import ProductList from './ProductList'

export default function Product() {
  return (
    <div className='row'>
        <div className='col-6'>
            <h2>{ProductList.name}</h2>
        </div>
      
    </div>
  )
}
