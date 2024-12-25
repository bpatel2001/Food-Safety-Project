import { useState, useEffect } from "react";
import axios from "axios";

function App() {
  interface CountryData {
    country: string;
    overall: number;
    affordability: number;
    availability: number;
    quality: number;
    sustainability: number;
    overallrank: number;
    affordabilityrank: number;
    availabilityrank: number;
    qualityrank: number;
    sustainabilityrank: number;
  }

  const [countries, setCountries] = useState<CountryData[]>([]);

  useEffect(() => {
    axios
      .get("http://localhost:8080/countries") 
      .then((response) => {
        setCountries(response.data);
      })
      .catch((error) => {
        console.error("Error fetching countries:", error);
      });
  }, []);

  return (
    <>
      <div>
        <p className="text-blue-100 bg-blue-500 text-4xl">Food Safety Viewer</p>
        <div>
          <div className="flex justify-center">
            <select className="border rounded p-2">
              {countries.map((country, index) => (
                <option key={index} value={country.country}>
                  {country.country}
                </option>
              ))}
            </select>
          </div>
          <div className="flex justify-center">
            <button className="border rounded p-2">
              Submit
            </button>
          </div>
        </div>
      </div>
    </>
  );
}

export default App;