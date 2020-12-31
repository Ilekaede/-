#include <bits/stdc++.h>
using namespace std;

int main(){
   int n,k;
   cin>>n>>k;
   long long int ans=0;
   vector<long long int> h(n);
   for(int i=0;i<n;i++){
      cin>>h[i];
      ans+=h[i];
   }

   if(n<=k){
      cout<<"0"<<endl;
      return 0;
   }

   sort(h.begin(),h.end());

   long long int cnt=0;
   for(int i=0;i<k;i++){
      cnt+=h[n-i-1];
   }

   cout<<ans-cnt<<endl;
   return 0;

}




      





