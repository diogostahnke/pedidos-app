import ContentLayout from "@/components/layout/content";
import React from "react";
import { BrowserRouter } from "react-router-dom";

import {
  QueryClient,
  QueryClientProvider
} from "@tanstack/react-query";

const queryClient = new QueryClient()

function AppProvider({ children }: { children: React.ReactNode }) {
  return (
    <QueryClientProvider client={queryClient}>
      <BrowserRouter>
        <ContentLayout>{children}</ContentLayout>
      </BrowserRouter>
    </QueryClientProvider>
  );
}

export default AppProvider;
