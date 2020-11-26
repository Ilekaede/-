#include <bits/stdc++.h>
#define rep(i,n) for(int i=0;i<n;i++)
using namespace std;
using ll=long long int;

int main(){
  ll a,b;
  cin>>a>>b;
  ll x=max(a,b);
  ll y=min(a,b);
  int ans=0;
  int i=1;
  while(ans==0){
    if(y*i%x==0){
      cout<<y*i<<endl;
      ans++;
    }
    else{
      i++;
    }
  }
}



