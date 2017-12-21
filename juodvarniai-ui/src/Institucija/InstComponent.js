import React from 'react'

const InstComponent = (props) => {
    const inst = props.vienaInst;
    return <span>Institucija: {inst.instPavadinimas} ir {inst.id}<br/></span>
}

export default InstComponent;