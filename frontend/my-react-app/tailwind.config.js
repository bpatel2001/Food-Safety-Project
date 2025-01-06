/** @type {import('tailwindcss').Config} */
module.exports = {
    content: [
      "./src/**/*.{js,jsx,ts,tsx}",
      require.resolve('react-widgets/styles.css'),
    ],
    theme: {
      extend: {
        spacing: {
          '128': '32rem',
          '144': '36rem',
        },
      },
    },
    plugins: [],
  }