const investimento = [
    { mes: 1, saldo: 100 }, 
    { mes: 2, saldo: 32.4 }, 
    { mes: 3,saldo: -55.9 },
    { mes: 4,saldo: -12.1 },
    { mes: 5,saldo: 27.4 },
    { mes: 6,saldo: -48.5 },
    { mes: 7,saldo: -25.3 },
    { mes: 8,saldo: 12.4 },
    { mes: 9,saldo: 3.7 }]

    //Um array com nome investimento_positivo com mês e saldo cujo saldo seja positivo
    const investimento_positivo = [
        { mes: 1, saldo: 100 },
        { mes: 2, saldo: 32.4 }, 
        { mes: 5,saldo: 27.4 },
        { mes: 8,saldo: 12.4 },
        { mes: 9,saldo: 3.7 }]
    //Um array com nome investimento_negativo com mês e saldo cujo saldo seja negativo
    const investimento_negativo = [
        { mes: 3,saldo: -55.9 },
        { mes: 4,saldo: -12.1 },
        { mes: 6,saldo: -48.5 },
        { mes: 7,saldo: -25.3 }
    ]
    //Um array com nome positivo apenas com o saldo positivo
    const positivo = [100,32.4,27.4, 12.4, 3.7 ]
    //Um array com nome negativo apenas com o saldo negativo
    const negativo = [-55.9,-12.1,-48.5 ,-25.3]
    //Uma variável com o total negativo
    let totalNegativo = 0;

    for(let i = 0; i < negativo.length; i++) {
      if(negativo[i] < 0) {
        totalNegativo += negativo[i];
      }
    }
    
    console.log("Total negativo: " + totalNegativo);
    //Uma variável com o total positivo
    let totalPositivo = 0;

    for(let i = 0; i < positivo.length; i++) {
      if(positivo[i] > 0) {
        totalPositivo += positivo[i];
      }
    }
    console.log("Total Positivo: " + totalPositivo);
    //Uma variável com o total final (negativo + positivo)
    let totalFinal = (totalNegativo + totalPositivo)
    console.log("Total Final: " + totalFinal);

  // com paradigma fucional 

const totalNegativo = negativo.filter(n => n < 0).reduce((acc, n) => acc + n, 0);
console.log("Total Final: " + totalNegativo);

const totalPositivo = positivo.filter(n => n > 0).reduce((acc, n) => acc + n, 0);
console.log("Total Positivo: " + totalPositivo);

const totalFinal= [ totalNegativo, totalPositivo].reduce((acc, n) => acc + n, 0);
console.log("Total Final: " + totalFinal);