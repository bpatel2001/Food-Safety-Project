import axios from 'axios'

function App() {
  const getCountry = () => {
    axios.get('http://localhost:8080/countries/Algeria')
    .then(res => {
      console.log(res)
    })
    .catch(err => {
      console.log(err)
    }) 
  }

  return (
    <>
      <div>
        <p className="text-blue-100 bg-blue-500 text-4xl">Hello</p>
      </div>
      <button onClick={getCountry}>Get Country</button>
    </>
  )
}

export default App

