import "bootstrap/dist/css/bootstrap.css";
import "./employee.css"
import React, { useEffect, useState } from "react";
import EmployeeService from "../Service/Service";

function Address(props) {

    const  [data, setdata] =  useState([])
    const  [countryid, setcountryid] =  useState()
    const  [states, setstates] =  useState([])
    const  [stateid, setstateid] =  useState()
    const  [City, setCity] =  useState([])
    const  [Cityid,setcityid] = useState()
    const  [location,setlocation]=useState([])
    

    useEffect(()=>{
      EmployeeService.getCountry().then(res=>setdata(res))
     },[])
     
   
      useEffect(()=>{
     if(countryid){
      EmployeeService.getStateById(countryid).then(res=>setstates(res))
     }
     
       },[countryid])
   
       useEffect(()=>{
           if(stateid){
            EmployeeService.getCityById(stateid).then(res=>setCity(res))
           }
           
             },[stateid])
  
             useEffect(()=>{
              if(Cityid){
               EmployeeService.getLocationById(Cityid).then(res=>setlocation(res))
              }
              
                },[Cityid])
          
  
             
   
   const hanleselect1=(e)=>{
      setcountryid(e.target.value)
      setstates([])
      setCity([])
   }
   const hanleselect2=(e)=>{
       setstateid(e.target.value)
       setCity([])
    }
    const hanleselect3=(e)=>{
      setcityid(e.target.value)
      setlocation([])
   }
 
    
       
    //  const handleSubmit=(e)=>{
    //     e.preventDefault();
    return (
      <div>
          {/* <form onSubmit={}> */}
        <div class="panel panel-default">
            <div class="panel-heading"><b></b></div>
            <div class="panel-body">
            <div className="form-group">
        <label for="address1">Address1</label>
        <input type="text" className="form-control" id="em_ADDRESS1" onChange={props.handlechange}/>
      </div>
      <div className="">
        <label for="address2">Address2</label>
        <input type="text" className="form-control" id="em_ADDRESS2" onChange={props.handlechange}/>
      </div>
      <div className="">
        <label for="address3">Address3</label>
        <input type="text" className="form-control" id="em_ADDRESS3" onChange={props.handlechange} />
      </div>
      <div className="">
        <label for="country">Country</label>
        <select className="form-select" id="country" onChange={hanleselect1}>
          <option>-- Select Country --</option>
          {data.map(c => (
            <option value={c.countryid}>{c.countryname}</option>
          ))}
        </select>
      </div>
      <div className="">
        <label for="state">State</label>
        <select className="form-select" id="state" onChange={hanleselect2}>
          <option>-- Select State --</option>
          {states.map(s => (
            <option value={s.stateid}>{s.statename}</option>
          ))}
        </select>
      </div>
      <div className="">
        <label for="city">City</label>
        <select className="form-control" id="city" onChange={hanleselect3}>
          <option>-- Select City --</option>
          {City.map(c => (
            <option value={c.cityid}>{c.cityname}</option>
          ))}
        </select>
      </div>
  
      <div className="">
        <label for="location" >Location</label>
        <select className="form-control" id="location" onChange={props.handlelocation}>
          <option>--SELECT--</option>
          {location.map(l => (
            <option value={l.locationid}>{l.locationname}</option>
          ))}
        </select>
      </div>
          <div class="form-group">
            <label for="pincode">Pin Code:</label>
            <input type="text" class="form-control" id="pincode" placeholder="Enter pin code"  onChange={props.handlechange}/>
          </div>
        </div>
      </div>
      
  {/*     
    </form> */}
      </div>
    )
  }
  
  


export default Address


