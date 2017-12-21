import React from 'react';
import ReactDOM from 'react-dom';
import {Router, Route, IndexRoute, hashHistory} from 'react-router';
import './index.css';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';

import InstContainer from './Institucija/InstContainer'

var NoMatch = (props) =>{
  return <div>Route did not match</div>;
}


var InitialApp=(props)=>{
  return <div>{props.children}</div>
}

ReactDOM.render((
  
<Router history={hashHistory}>
    <Route path="/" component={InitialApp}>
    <IndexRoute component={InstContainer}/>
    <Route path="/obuolys" component={InstContainer}/>
    {/* <Route path="/admin/institucija/:id" component={Administration}/>
    <Route path="/admin/institucija/new" component={Administration}/> */}
    {/* <Route path="/knyga" component={Knyga}/>  */}
    <Route path="*" component={NoMatch}/>
    </Route>
  </Router>), 
  document.getElementById('root')
);

