import React from "react";

class Navbar extends React.Component {
  render() {
    return (
      <nav className="navbar navbar-expand-lg navbar-light bg-white shadow-sm">
  <div className="container">
    {/* Brand */}
    <a className="navbar-brand fw-bold text-primary" href="/">
      ApnaCart
    </a>

    {/* Toggle button */}
    <button
      className="navbar-toggler"
      type="button"
      data-bs-toggle="collapse"
      data-bs-target="#mainNavbar"
      aria-controls="mainNavbar"
      aria-expanded="false"
      aria-label="Toggle navigation"
    >
      <span className="navbar-toggler-icon"></span>
    </button>

    {/* Navbar links */}
    <div className="collapse navbar-collapse" id="mainNavbar">
      <ul className="navbar-nav ms-auto mb-2 mb-lg-0 align-items-lg-center">
        <li className="nav-item">
          <a className="nav-link active fw-medium" href="/">
            Home
          </a>
        </li>

        <li className="nav-item">
          <a className="nav-link fw-medium" href="/">
            Products
          </a>
        </li>

        <li className="nav-item">
          <a className="nav-link fw-medium" href="/">
            About
          </a>
        </li>

        <li className="nav-item ms-lg-3">
          <button className="btn btn-outline-primary btn-sm">
            Login
          </button>
        </li>
      </ul>
    </div>
  </div>
</nav>
    );
  }
}

export default Navbar;
