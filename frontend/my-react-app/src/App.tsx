import { useState, useEffect } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";

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

  const navigate = useNavigate();

  const handleSubmit = (e: React.FormEvent<HTMLFormElement>) => {
    e.preventDefault();
    const selectedCountry = (e.target as HTMLFormElement).country.value;
    navigate(`/result?country=${selectedCountry}`);
  }

  const [countries, setCountries] = useState<CountryData[]>([]);

  useEffect(() => {
    const storedCountries = localStorage.getItem("countries");
    if (storedCountries) {
      setCountries(JSON.parse(storedCountries));
      console.log(storedCountries);
    } else {
      axios
        .get("http://localhost:8080/countries")
        .then((response) => {
          setCountries(response.data);
          localStorage.setItem("countries", JSON.stringify(response.data));
        })
        .catch((error) => {
          console.error("Error fetching countries:", error);
        });
    }
  }, []);

  return (
    <>
      <div>
        <p className="text-blue-100 bg-blue-500 text-4xl">Food Safety Viewer</p>
        <form onSubmit={handleSubmit}>
          <div className="flex justify-center">
            <select name = "country"className="border rounded p-2">
              {countries.map((country, index) => (
                <option key={index} value={country.country}>
                  {country.country}
                </option>
              ))}
            </select>
          </div>
          <div className="flex justify-center">
            <button type = "submit" className="border rounded p-2">
              Submit
            </button>
          </div>
        </form>
      </div>
    </>
  );
}

export default App;