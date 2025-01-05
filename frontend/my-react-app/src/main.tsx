import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.tsx'
import Result from './Result.tsx'

import {createBrowserRouter, RouterProvider} from 'react-router-dom'

const router = createBrowserRouter([
  {
    path: "/",
    element: <App />,
    errorElement: <div className='flex justify-center text-4xl'>404: Not Found</div>
  },
  {
    path: "/result",
    element: <Result />,
  }
])

createRoot(document.getElementById('root')!).render(
  //<StrictMode>
  <RouterProvider router={router} />
  //</StrictMode>,
)
