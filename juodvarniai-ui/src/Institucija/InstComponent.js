import React from 'react'

const InstComponent = (props) => {
    const inst = props.vienaInst;
    return <span>Institucija: {inst.instPavadinimas}, {inst.id}, {inst.miestas}, {inst.kategorija}, {inst.nuotrauka}<br/></span>
}

export default InstComponent;