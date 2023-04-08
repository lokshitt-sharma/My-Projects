import React from "react";
import  '../css/form_style.css' ; 
import img from '../img/bg.jpg' ; 

export default function Login() {
  return (
    <>
      <section className="ftco-section">
        <div className="container">
          <div className="row justify-content-center">
            <div className="col-md-6 text-center mb-5">
              <h2 className="heading-section">Welcome!!</h2>
            </div>
          </div>
          <div className="row justify-content-center">
            <div className="col-md-7 col-lg-5">
              <div className="login-wrap p-4 p-md-5">                
                <img   className="img" src={img} alt = ""></img>
                <h3 className="text-center mb-4">Please login !!</h3>
                <form action="#" className="signup-form">
                  <div className="form-group mb-3">
                    <label className="label" htmlFor="email">
                      Email Address
                    </label>
                    <input
                      type="text"
                      className="form-control"
                      placeholder="Please enter your Email ID"
                    />
                  </div>
                  <div className="form-group mb-3">
                    <label className="label" htmlFor="password">
                      Password
                    </label>
                    <input
                      id="password-field"
                      type="password"
                      className="form-control"
                      placeholder="Password"
                    />
                    <span
                      toggle="#password-field"
                      className="fa fa-fw fa-eye field-icon toggle-password"
                    />
                  </div>
                  <div className="form-group">
                    <button
                      type="submit"
                      className="form-control btn btn-primary submit px-3" href = "#"
                    >
                      Sign In
                    </button>
                  </div>
                </form>
              </div>
            </div>
          </div>
        </div>
      </section>
    </>
  );
}
