import { Route, Routes } from 'react-router-dom';
import './App.css';
import "bootstrap/dist/css/bootstrap.css";
import AddEmployee from './component/AddEmployee';
import Home from './component/Home';

function App() {
  return (
    <div>
      <Routes>
        <Route exact path='/' element={<Home/>}/>
        <Route path='/addemployee' element={<AddEmployee/>}/>
      </Routes>
    </div>
  );
}

export default App;
