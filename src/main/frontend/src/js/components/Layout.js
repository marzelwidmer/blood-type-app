import React from 'react';

import Header from './Header';
import Footer from './Footer';


export default class Layout extends React.Component {
  constructor() {
    super()
    this.state = {name: "Will"};
  }
  render() {
    setTimeout(() =>{
      this.setState({name : "Bob"})
    }, 5000);
    return (
      <div>
        {this.state.name}
        <Header />
        <Footer />
      </div>
    );
  }
}
