import "./App.css";
import Navbar from "./components/Navbar";
import ProductList from "./components/ProductList";


function App() {
  const productList = [
    {
      price: 9999,
      name: "iphone12",
      qty: 0,
    },
    {
      price: 19999,
      name: "iphone13",
      qty: 0,
    },
  ];

  return (
    <>
      <Navbar />
      <ProductList ProductList={productList} />
     
    </>
  );
}

export default App;
