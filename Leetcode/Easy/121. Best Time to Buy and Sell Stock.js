//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

/**
 * @param {number[]} prices
 * @return {number}
 */
 const maxProfit = function(prices) {
    let answer=0;
    let buy=Number.MAX_SAFE_INTEGER;
    
    for(let i=0;i<prices.length;i++){
        if(buy>prices[i]){
            buy=prices[i];
        }
        else{
            answer=Math.max(prices[i]-buy,answer);
        }
    }
    
    return answer;
};
