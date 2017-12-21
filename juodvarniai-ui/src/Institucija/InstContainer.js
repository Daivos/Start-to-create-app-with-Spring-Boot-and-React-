import React, {Component} from 'react';
import InstListComponent from './InstListComponent'
import axios from 'axios'

class InstContainer extends Component {
    constructor() {
        super();

        this.state = {
            instList: []
        }
    }

    componentWillMount() {
        axios
            .get("http://localhost:8081/rest/institucija")
            .then((atsakymasIsServerio) => {
                console.log(atsakymasIsServerio);
                this.setState({instList: atsakymasIsServerio.data});
            })
            .catch((klaida) => {
                console.log(klaida);
            });
        
    }

    render() {
        return <InstListComponent visosInst={this.state.instList}/>
    }
}

export default InstContainer;