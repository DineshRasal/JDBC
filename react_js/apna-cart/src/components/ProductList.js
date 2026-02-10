import React from 'react';
import Product from './Product.js';


export default function ProductList({product}) {
  return (
   ProductList.map((product,index)=>{
    return <Product product={product} key={index}/>
   })
  )
}

