import React from 'react'
import InstComponent from '../InstComponent'

const Filtras = (props) => {
    const inst = props.instList;
    const newListItems = inst.filter(in => in.instPavadinimas='Vagos knygynas')
        .map(ic =>
            <InstComponent
                key={ic.id}
                instPavadinimas={ic.instPavadinimas}
            />
        );
    return (
        <div className="row">
            {newListItems}
        </div>
    )
};

export default Filtras;