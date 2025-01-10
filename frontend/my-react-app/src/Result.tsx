import { useLocation } from 'react-router-dom'
import axios from 'axios';
import { useEffect, useState } from 'react';

function Result() {
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

    const [countryData, setCountryData] = useState<CountryData | null>(null); 

    const location = useLocation();
    const country = location.search.split('=')[1];

    useEffect(() => {
        axios
          .get(`http://localhost:8080/countries/${country}`) 
          .then((response) => {
            setCountryData(response.data); 
          })
          .catch((error) => {
            console.error("Error fetching country data:", error);
          });
      }, [country]);

    console.log(countryData?.overall); 

    return (
        <div>
            <h1>Result for {country}</h1>
            {countryData && (
                <div>
                    <p>Overall ranking of the country: {countryData.overallrank}</p>
                    <p>This is an overall x Score</p>
                    <p>Quality ranking of the country: {countryData.qualityrank}</p>
                    <p>This is a quality x Score</p>
                    <p>Sustainability ranking of the country: {countryData.sustainabilityrank}</p>
                    <p>This is a sustainability x Score</p>
                    <p>Affordability ranking of the country: {countryData.affordabilityrank}</p>
                    <p>This is an affordability x Score</p>
                    <p>Availability ranking of the country: {countryData.availabilityrank}</p>
                    <p>This is an availability x Score</p>
                </div>
            )}
        </div>
    );
}
export default Result;